package no.met.metdata.proxy;


/**
 * Java Bean: no_met_metdata_CountyTypes
 *    for Web service proxy: MetDataServiceProxy
 *    generated by Oracle WSDL toolkit (Version: 1.0).
 */
public class no_met_metdata_CountyTypes {

    public no_met_metdata_CountyTypes() {

    }

    public no_met_metdata_CountyTypes(java.lang.String _language, java.lang.String _countyName, java.lang.Integer _countyID) {
        m_language = _language;
        m_countyName = _countyName;
        m_countyID = _countyID;

    }

    public java.lang.String getLanguage() {
        return m_language;

    }

    public void setLanguage(java.lang.String _language) {
        m_language = _language;

    }

    public java.lang.String getCountyName() {
        return m_countyName;

    }

    public void setCountyName(java.lang.String _countyName) {
        m_countyName = _countyName;

    }

    public java.lang.Integer getCountyID() {
        return m_countyID;

    }

    public void setCountyID(java.lang.Integer _countyID) {
        m_countyID = _countyID;

    }


    private java.lang.String m_language;
    private java.lang.String m_countyName;
    private java.lang.Integer m_countyID;

}
