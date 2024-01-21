package sa.tas.rest;

import io.cucumber.java.en.Given;

public class RestBDD {

    private  final RestManager restManager = new RestManager();

    @Given("REST sets Endpoint URI to {string}.")
    public void setURI(final String endpoints){
       restManager.setEndPointURI(endpoints);
    }


}
