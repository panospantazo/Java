class Vehicle{
    
    //Atributes
    private String make;
    private String model;
    private int year;
    private float weight;
    private boolean needsMaintenance;
    private int tripsSinceMaintenance;

    //Setters
    public void make_setter(String make){
        this.make = make;
    }
    public void model_setter(String model){
        this.model = model;
    }
    public void year_setter(int year){
        this.year = year;
    }
    public void weight_setter(float weight){
        this.weight = weight;
    }
    public void needsMaintenance_setter(boolean F){
        needsMaintenance = F;
    }
    public void tripsSinceMaintenance_setter(int trips){
        tripsSinceMaintenance = trips;
    }

    //Getters     
    public String make_getter(){
        return make;
    }
    public String model_getter(){
        return model;
    }
    public int year_getter(){
        return year;
    }
    public float weight_getter(){
        return weight;
    }
    public boolean needsMaintenance_getter(){
        return needsMaintenance;
    }
    public int tripsSinceMaintenance_getter(){
        return tripsSinceMaintenance;
    }

    //Constructors
    public Vehicle(String make,String model,int year,float weight){
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = weight;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
    public Vehicle(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.weight = 0;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
    public Vehicle(String make,String model){
        this.make = make;
        this.model = model;
        this.year = 0;
        this.weight = 0;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
    public Vehicle(String make){
        this.make = make;
        this.model = "Empty";
        this.year = 0;
        this.weight = 0;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
    public Vehicle(){
        this.make = "Empty";
        this.model = "Empty";
        this.year = 0;
        this.weight = 0;
        needsMaintenance = false;
        tripsSinceMaintenance = 0;
    }
}
