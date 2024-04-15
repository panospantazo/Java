class Plane extends Vehicle{

    //Atributes
    private boolean isFlying;
    private float wingspan;

    //Constuctors
    public Plane(String make,String model,int year,float weight,float wingspan){
        super(make,model,year,weight);
        isFlying = false;
        this.wingspan = wingspan;
    }

    public Plane(String make,String model,int year,float weight){
        super(make,model,year,weight);
        isFlying = false;
        this.wingspan = 0;
    }

    public Plane(String make,String model,int year,int wingspan){
        super(make,model,year);
        isFlying = false;
        this.wingspan = wingspan;
    }

    public Plane(String make,String model,int year){
        super(make,model,year);
        isFlying = false;
        this.wingspan = 0;
    }

    public Plane(String make,int wingspan,String model){
        super(make,model);
        isFlying = false;
        this.wingspan = wingspan;
    }

    public Plane(String make,String model){
        super(make,model);
        isFlying = false;
        this.wingspan = 0;
    }

    public Plane(String make,int wingspan){
        super(make);
        isFlying = false;
        this.wingspan = wingspan;
    }

    public Plane(String make){
        super(make);
        isFlying = false;
        this.wingspan = 0;
    }

    public Plane(int wingspan){
        super();
        isFlying = false;
        this.wingspan = wingspan;
    }

    public Plane(){
        super();
        isFlying = false;
        this.wingspan = 0;
    }

     //Methods that object is doing something

     public void Fly(){
        if(tripsSinceMaintenance_getter() < 80){
            isFlying = true;
        }
    }

    public void Land(){

        if(tripsSinceMaintenance_getter() >= 80){

            needsMaintenance_setter(true);
            System.out.println("The plane ("+model_getter()+") can't do another trips because needs maintenance (tripsSinceMaintenance = "+tripsSinceMaintenance_getter()+")\n");
        }
        else{
            isFlying = false;
            tripsSinceMaintenance_setter(tripsSinceMaintenance_getter()+1);
        }
    }

    //Display the object
    public String toString(){

        return "|Make: "+make_getter().toString()+"|Model: "+model_getter().toString()+"|Year: "+year_getter()+"|Weight: "+weight_getter()+"|Needs Maintenance: "+needsMaintenance_getter()+"|Trips since maintenance: "+tripsSinceMaintenance_getter()+"|isDriving: "+isFlying+"|Horsepower: "+wingspan+"|\n";
    }
}