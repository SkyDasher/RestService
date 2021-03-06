package services;

import model.Panel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;


@Path("/panelservice")
public class PanelService {

    @POST
    @Path("/create")
    @Produces("application/json")
    public Response createPanel(String JSONArray) throws JSONException {
        JSONObject obj = null;
        try {
            obj = new JSONObject(JSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Panel panel = new Panel();
        panel.setName(obj.getString("name"));
        panel.setId(obj.getInt("id"));
        panel.setCost(obj.getInt("cost"));
        panel.setDate(obj.getInt("date"));
        return Response.status(500).entity(panel.toString()).build();
    }
    @GET
    @Path("/getall")
    @Consumes("application/json")
    public Response getAllPanel(){
        ArrayList<Panel> listPanel = new ArrayList();
        Panel p1 = new Panel();
        p1.setId(1);
        p1.setName("SimplePanel");
        p1.setCost(300);
        p1.setDate(10-10-2014);
        Panel p2 = new Panel();
        p2.setId(2);
        p2.setName("ComplexPanel");
        p2.setCost(500);
        p2.setDate(11-11-2015);
        listPanel.add(p1);
        listPanel.add(p2);
        JSONArray json = new JSONArray(listPanel);
        JSONObject obj = new JSONObject();
        try {
            obj.put("allPanels",json.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return Response.status(500).entity(obj.toString()).build();
    }


}
