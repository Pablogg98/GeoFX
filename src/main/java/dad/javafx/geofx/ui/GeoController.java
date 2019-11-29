package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.client.IpApiService;
import dad.javafx.geofx.client.json.Raiz;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class GeoController implements Initializable {

	// model

	private GeoModel model = new GeoModel();;

	private Task<Void> tarea;
	private Raiz raiz = new Raiz();
	IpApiService service = new IpApiService();

	// view
	@FXML
	private BorderPane view;

	@FXML
	private Label latitudValueLb;

	@FXML
	private Label longitudValueLb;

	@FXML
	private Label ipLocationLb;

	@FXML
	private ImageView flagImageView;

	@FXML
	private Label cityValueLb;

	@FXML
	private Label zipCodeValueLb;

	@FXML
	private Label languageValueLb;

	@FXML
	private Label timeZoneValueLb;

	@FXML
	private Label callCodeValueLb;

	@FXML
	private Label currencyValueLb;

	@FXML
	private Label ipDirValueLb;

	@FXML
	private Label ipsValueLb;

	@FXML
	private Label type;

	@FXML
	private Label asnValueLb;

	@FXML
	private Label hostValueLb;

	@FXML
	private Label safeLb;

	@FXML
	private CheckBox proxyCb;

	@FXML
	private CheckBox torCb;

	@FXML
	private CheckBox crawlerCb;

	@FXML
	private Label threatValueLb;

	@FXML
	private Label threatsTypeValueLb;

	@FXML
	private TextField ipTxt;

	@FXML
	private Button chechIpBtn;

	public GeoController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeoView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		latitudValueLb.textProperty().bind(model.latitudProperty());
		longitudValueLb.textProperty().bind(model.longitudProperty());
		ipDirValueLb.textProperty().bind(model.ipProperty());
		cityValueLb.textProperty().bind(model.cityProperty());
		zipCodeValueLb.textProperty().bind(model.zipCodeProperty());
		languageValueLb.textProperty().bind(model.languageProperty());
		timeZoneValueLb.textProperty().bind(model.timeZoneProperty());
		callCodeValueLb.textProperty().bind(model.callCodeProperty());
		currencyValueLb.textProperty().bind(model.currencyProperty());
		ipsValueLb.textProperty().bind(model.ipsProperty());
		type.textProperty().bind(model.typeCProperty());
		asnValueLb.textProperty().bind(model.asnProperty());
		hostValueLb.textProperty().bind(model.hostnameProperty());
		safeLb.textProperty().bind(model.safeProperty());
		threatValueLb.textProperty().bind(model.threatProperty());
		threatsTypeValueLb.textProperty().bind(model.threatsTypeProperty());
		ipLocationLb.textProperty().bind(model.ipLocationProperty());
		ipTxt.textProperty().bindBidirectional(model.ipTxtProperty());
		proxyCb.selectedProperty().bind(model.proxyProperty());
		torCb.selectedProperty().bind(model.torProperty());
		crawlerCb.selectedProperty().bind(model.crawlerProperty());

		actualizar("check");
	}

	private void actualizar(String ip) {

		tarea = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				raiz = service.listRaizIp(ip);
				return null;
			}
		};

		tarea.setOnSucceeded(e -> {
			try {
				model.setIpTxt(raiz.getIp());
				model.setLatitud("" + raiz.getLatitude());
				model.setLongitud("" + raiz.getLongitude());
				model.setIpLocation(raiz.getCountryName() + " (" + raiz.getCountryCode() + ")");
				Image img = new Image(
						"https://raw.githubusercontent.com/dam-dad/Flags/master/64/" + raiz.getCountryCode() + ".png");
				flagImageView.setImage(img);
				model.setCity(raiz.getCity());
				model.setZipCode(raiz.getZip());
				model.setLanguage(raiz.getLocation().getLanguages().get(0).getName());
				model.setTimeZone("-" + raiz.getTimeZone());
				model.setCallCode(raiz.getLocation().getCallingCode());
				model.setCurrency("");
			} catch (Exception e1) {
				model.setIpTxt("");
				model.setLatitud("-");
				model.setLongitud("-");
				model.setIpLocation("-");
				try {
					flagImageView.setImage(new Image(""));
				} catch (Exception e2) { }
				model.setCity("-");
				model.setZipCode("-");
				model.setLanguage("-");
				model.setTimeZone("-");
				model.setCallCode("-");
				model.setCurrency("-");
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error");
				alert.setHeaderText("Algo no fue bien");
				alert.setContentText("IP no válida");
				alert.showAndWait();
			}
		});

		tarea.setOnFailed(e -> {
			model.setIpTxt("");
			model.setLatitud("-");
			model.setLongitud("-");
			model.setIpLocation("-");
			try {
				flagImageView.setImage(new Image(""));
			} catch (Exception e1) { }
			model.setCity("-");
			model.setZipCode("-");
			model.setLanguage("-");
			model.setTimeZone("-");
			model.setCallCode("-");
			model.setCurrency("-");
			e.getSource().getException().printStackTrace();
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Algo no fue bien");
			alert.setContentText(e.getSource().getException().getMessage());
			alert.showAndWait();
		});

		new Thread(tarea).start();
	}

	@FXML
	void onCheckAction(ActionEvent event) {
		actualizar(model.getIpTxt());
	}

	public BorderPane getView() {
		return view;
	}

}
