/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

abstract class Shape{
    
    private String name = "Shape";
    private int sides = 1;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("Name is too short. Must be at least 3 characters");
        }
        this.name = name;
    }
    public int getSides(){
        return sides;
    }
    public void setSides(int sides){
        
        if(sides < 1){
            throw new IllegalArgumentException("Sides must be at least 1");
        }
        this.sides = sides;
    }
    
    public Shape(){}
    
    public Shape(String name, int sides){
        setName(name);
        setSides(sides);
    }
    
    
    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    
}

abstract class ThreeDShape extends Shape{
    
    public double volume, height;
    
    public ThreeDShape(){
        super();
    }
    public ThreeDShape(String name, int sides){
        super(name, sides);
    }
    public ThreeDShape(String name, int sides, double height, double volume){
        super(name, sides);
        this.height = height;
        this.volume = volume;
    }
}

class Rectangle extends Shape{
    
    
    @Override
    public double getPerimeter(){
        return 1.1;
    }
    @Override
    public double getArea(){
        return 1.1;
    }
}


abstract class PaymentProcessor{
    /*
    	pri	card: String: only accept 3 card types
	pri	price: double: 0+
	pri	type: purchase or refund
	pri	change: 0 or more
	pri	quantity: 1+
	pri	status: complete & incomplete
    */
    private String card = "Debit";
    private String status;
    private String type = "purchase";

    private double price;
    private double change;

    private int quantity;
    
    public String getCard(){return card;}
    public String getStatus(){return status;}
    public String getType(){return type;}

    public double getPrice(){return price;}    
    public double getChange(){return change;}
    public int getQuantity(){return quantity;}
    
    public void setCard(String card){
        if(card.equalsIgnoreCase("visa") || card.equalsIgnoreCase("debit") || card.equalsIgnoreCase("cash")){
            this.card = card;
        }
    }    
    public void setStatus(String status){
                if(status.equalsIgnoreCase("complete") || status.equalsIgnoreCase("incomplete")){
            this.status = status;
        }

    }    
    public void setType(String type){
        if(type.equalsIgnoreCase("purchase") || type.equalsIgnoreCase("refund")){
            this.type = type;
        }

    }    
    public void setPrice(double price){
        this.price = price >= 0 ? price : 0;
        
        if(price >= 0){
            this.price = price;
        }
        else{
            this.price = 0;
        }
        
    }    
    public void setChange(double change){
        this.change = type.equalsIgnoreCase("cash") ? change : 0;
    }    
    public void setQuanity(int quantity){
        this.quantity = quantity >= 1 ? quantity : 1;
    }  
    
    public PaymentProcessor(){}
    
    public abstract double getMarkUp();
    
    public abstract void makePayment(int productCode, int quantity, int pricePerUnit, String card);
    
    //for fun: add abstract method to getRefund()
}


class Store extends PaymentProcessor{
    
    private double markupPrice = 1.3;
    
    @Override
    public double getMarkUp(){
        
        return (getPrice() * getQuantity()) * markupPrice;
    }
    public void makePayment(int productCode, int quantity, int pricePerUnit, String card){
        setQuanity(quantity);
        setPrice(pricePerUnit);
        setCard(card);
        setType("purchase");
        setStatus("complete");
        
        
    }
    
}

interface Pet{
    int MAX_WEIGHT = 100; //constant value
    String speak();
    void eat();
}


interface DangerousPet extends Pet{
    
    double getDangerLevel();
    float scariness(String timeOfTime, double foodInStomach);
}
class Snake implements DangerousPet{
    
    @Override
    public String speak(){return "bark";}
    @Override
    public void eat(){System.out.println("Yum,yum");}
    @Override
    public double getDangerLevel(){return 100d;}
    @Override
    public float scariness(String timeOfTime, double foodInStomach){return 100f;}
    
}
interface Calculator{
    
    double add(double n1, double n2);
    double sub(double n1, double n2);
    double mul(double n1, double n2);
    double div(double n1, double n2);
}

interface randomInterface extends Pet, Calculator{}

class Dog implements Pet{
    
    @Override
    public String speak(){return "bark";}
    @Override
    public void eat(){System.out.println("Yum,yum");}
    
}

class DigitalPet extends Rectangle implements Pet, Calculator{


    @Override
    public String speak(){return "computer is on";}
    @Override
    public void eat(){System.out.println("I am digital. I do not eat");}
    
    @Override
    public double add(double n1, double n2){
        return n1 + n2;
    }
    @Override
    public double sub(double n1, double n2){
        return n1 - n2;
    }
    @Override
    public double mul(double n1, double n2){
        return n1 * n2;
    }
    @Override
    public double div(double n1, double n2){
        return n1 / n2 > 0 ? n2 : 1;
    }

    
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		Rectangle r1 = new Rectangle();
		Shape s1 = new Rectangle();
	}
}
