package no.met.metdata.proxy;


/**
 * Java Bean: no_met_metdata_Location
 *    for Web service proxy: MetDataServiceProxy
 *    generated by Oracle WSDL toolkit (Version: 1.0).
 */
public class no_met_metdata_Location {

    public no_met_metdata_Location() {

    }

    public no_met_metdata_Location(java.lang.Integer _id, java.lang.String _type, no.met.metdata.proxy.no_met_metdata_WeatherElement[] _weatherElement) {
        m_id = _id;
        m_type = _type;
        m_weatherElement = _weatherElement;

    }

    public java.lang.Integer getId() {
        return m_id;

    }

    public void setId(java.lang.Integer _id) {
        m_id = _id;

    }

    public java.lang.String getType() {
        return m_type;

    }

    public void setType(java.lang.String _type) {
        m_type = _type;

    }

    public no.met.metdata.proxy.no_met_metdata_WeatherElement[] getWeatherElement() {
        return m_weatherElement;

    }

    public void setWeatherElement(no.met.metdata.proxy.no_met_metdata_WeatherElement[] _weatherElement) {
        m_weatherElement = _weatherElement;

    }


    private java.lang.Integer m_id;
    private java.lang.String m_type;
    private no.met.metdata.proxy.no_met_metdata_WeatherElement[] m_weatherElement;

}
