package no.met.metdata.proxy;


/**
 * Java Bean: no_met_metdata_WeatherElement
 *    for Web service proxy: MetDataServiceProxy
 *    generated by Oracle WSDL toolkit (Version: 1.0).
 */
public class no_met_metdata_WeatherElement {

    public no_met_metdata_WeatherElement() {

    }

    public no_met_metdata_WeatherElement(java.lang.String _id, java.lang.Integer _quality, java.lang.String _value) {
        m_id = _id;
        m_quality = _quality;
        m_value = _value;

    }

    public java.lang.String getId() {
        return m_id;

    }

    public void setId(java.lang.String _id) {
        m_id = _id;

    }

    public java.lang.Integer getQuality() {
        return m_quality;

    }

    public void setQuality(java.lang.Integer _quality) {
        m_quality = _quality;

    }

    public java.lang.String getValue() {
        return m_value;

    }

    public void setValue(java.lang.String _value) {
        m_value = _value;

    }


    private java.lang.String m_id;
    private java.lang.Integer m_quality;
    private java.lang.String m_value;

}
