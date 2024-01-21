package sa.tas.rest;


public class RestManager {

    private String endpointURI="";

    public void setEndPointURI(String endpointURI) {
        this.endpointURI = endpointURI;
        System.out.println(endpointURI);
    }
}
