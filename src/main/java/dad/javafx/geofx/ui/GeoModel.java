package dad.javafx.geofx.ui;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoModel {

	private StringProperty latitud = new SimpleStringProperty();
	private StringProperty longitud = new SimpleStringProperty();
	private StringProperty ip = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty zipCode = new SimpleStringProperty();
	private StringProperty language = new SimpleStringProperty();
	private StringProperty timeZone = new SimpleStringProperty();
	private StringProperty callCode = new SimpleStringProperty();
	private StringProperty currency = new SimpleStringProperty();
	private StringProperty ips = new SimpleStringProperty();
	private StringProperty typeC = new SimpleStringProperty();
	private StringProperty asn = new SimpleStringProperty();
	private StringProperty hostname = new SimpleStringProperty();
	private StringProperty safe = new SimpleStringProperty();
	private StringProperty threat = new SimpleStringProperty();
	private StringProperty threatsType = new SimpleStringProperty();
	private StringProperty ipLocation = new SimpleStringProperty();
	private StringProperty ipTxt = new SimpleStringProperty();
	private BooleanProperty proxy = new SimpleBooleanProperty();
	private BooleanProperty tor = new SimpleBooleanProperty();
	private BooleanProperty crawler = new SimpleBooleanProperty();
	
	public final StringProperty latitudProperty() {
		return this.latitud;
	}
	
	public final String getLatitud() {
		return this.latitudProperty().get();
	}
	
	public final void setLatitud(final String latitud) {
		this.latitudProperty().set(latitud);
	}
	
	public final StringProperty longitudProperty() {
		return this.longitud;
	}
	
	public final String getLongitud() {
		return this.longitudProperty().get();
	}
	
	public final void setLongitud(final String longitud) {
		this.longitudProperty().set(longitud);
	}
	
	public final StringProperty ipProperty() {
		return this.ip;
	}
	
	public final String getIp() {
		return this.ipProperty().get();
	}
	
	public final void setIp(final String ip) {
		this.ipProperty().set(ip);
	}
	
	public final StringProperty cityProperty() {
		return this.city;
	}
	
	public final String getCity() {
		return this.cityProperty().get();
	}
	
	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	
	public final StringProperty zipCodeProperty() {
		return this.zipCode;
	}
	
	public final String getZipCode() {
		return this.zipCodeProperty().get();
	}
	
	public final void setZipCode(final String zipCode) {
		this.zipCodeProperty().set(zipCode);
	}
	
	public final StringProperty languageProperty() {
		return this.language;
	}
	
	public final String getLanguage() {
		return this.languageProperty().get();
	}
	
	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	
	public final StringProperty timeZoneProperty() {
		return this.timeZone;
	}
	
	public final String getTimeZone() {
		return this.timeZoneProperty().get();
	}
	
	public final void setTimeZone(final String timeZone) {
		this.timeZoneProperty().set(timeZone);
	}
	
	public final StringProperty callCodeProperty() {
		return this.callCode;
	}
	
	public final String getCallCode() {
		return this.callCodeProperty().get();
	}
	
	public final void setCallCode(final String callCode) {
		this.callCodeProperty().set(callCode);
	}
	
	public final StringProperty currencyProperty() {
		return this.currency;
	}
	
	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	
	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	
	public final StringProperty ipsProperty() {
		return this.ips;
	}
	
	public final String getIps() {
		return this.ipsProperty().get();
	}
	
	public final void setIps(final String ips) {
		this.ipsProperty().set(ips);
	}
	
	public final StringProperty typeCProperty() {
		return this.typeC;
	}
	
	public final String getTypeC() {
		return this.typeCProperty().get();
	}
	
	public final void setTypeC(final String typeC) {
		this.typeCProperty().set(typeC);
	}
	
	public final StringProperty asnProperty() {
		return this.asn;
	}
	
	public final String getAsn() {
		return this.asnProperty().get();
	}
	
	public final void setAsn(final String asn) {
		this.asnProperty().set(asn);
	}
	
	public final StringProperty hostnameProperty() {
		return this.hostname;
	}
	
	public final String getHostname() {
		return this.hostnameProperty().get();
	}
	
	public final void setHostname(final String hostname) {
		this.hostnameProperty().set(hostname);
	}
	
	public final StringProperty safeProperty() {
		return this.safe;
	}
	
	public final String getSafe() {
		return this.safeProperty().get();
	}
	
	public final void setSafe(final String safe) {
		this.safeProperty().set(safe);
	}
	
	public final StringProperty threatProperty() {
		return this.threat;
	}
	
	public final String getThreat() {
		return this.threatProperty().get();
	}
	
	public final void setThreat(final String threat) {
		this.threatProperty().set(threat);
	}
	
	public final StringProperty threatsTypeProperty() {
		return this.threatsType;
	}
	
	public final String getThreatsType() {
		return this.threatsTypeProperty().get();
	}
	
	public final void setThreatsType(final String threatsType) {
		this.threatsTypeProperty().set(threatsType);
	}
	
	public final StringProperty ipLocationProperty() {
		return this.ipLocation;
	}
	
	public final String getIpLocation() {
		return this.ipLocationProperty().get();
	}
	
	public final void setIpLocation(final String ipLocation) {
		this.ipLocationProperty().set(ipLocation);
	}
	
	public final StringProperty ipTxtProperty() {
		return this.ipTxt;
	}
	
	public final String getIpTxt() {
		return this.ipTxtProperty().get();
	}
	
	public final void setIpTxt(final String ipTxt) {
		this.ipTxtProperty().set(ipTxt);
	}
	
	public final BooleanProperty proxyProperty() {
		return this.proxy;
	}
	
	public final boolean isProxy() {
		return this.proxyProperty().get();
	}
	
	public final void setProxy(final boolean proxy) {
		this.proxyProperty().set(proxy);
	}
	
	public final BooleanProperty torProperty() {
		return this.tor;
	}
	
	public final boolean isTor() {
		return this.torProperty().get();
	}
	
	public final void setTor(final boolean tor) {
		this.torProperty().set(tor);
	}
	
	public final BooleanProperty crawlerProperty() {
		return this.crawler;
	}
	
	public final boolean isCrawler() {
		return this.crawlerProperty().get();
	}
	
	public final void setCrawler(final boolean crawler) {
		this.crawlerProperty().set(crawler);
	}
	
}
