package wk3;

import java.util.ArrayList;

public class OsmowsMeal {

    private String protein="beef", side="rice", sauce="hot";


    public OsmowsMeal(){}

    public OsmowsMeal(String protein){
        setProtein(protein);
    }
    public OsmowsMeal(String protein, String side){
        setProtein(protein);
        setSide(side);
    }
    public void setSide(String side){
        ArrayList<String> allowableSides = new ArrayList<>();
        allowableSides.add("fries");
        allowableSides.add("salad");
        allowableSides.add("rice");

        if(allowableSides.contains(side.toLowerCase())){
            this.side = side;
        }
    }
    public void setProtein(String protein){
        String[] allowableProteins = {"beef", "chicken", "tofu"};
        for(String currentProtein : allowableProteins){
            if(protein.equalsIgnoreCase(currentProtein)){
                this.protein = protein;
                break;
            }
        }

    }
    public String getProtein() {
        return protein;
    }

    public String getSide() {
        return side;
    }

    public String getSauce() {
        return sauce;
    }

    @Override
    public String toString(){
        return String.format("Protein = %s, Side=%s, Sauce=%s",
                protein, side, sauce);
    }
}
