class Car extends Vehicle{
    
    private boolean isDriving;
    private int horsepower;

    //Constructors 
    public Car(String make,String model,int year,float weight,int horsepower){
        super(make,model,year,weight);
        isDriving = false;
        this.horsepower = horsepower;
    }

    public Car(String make,String model,int year,float weight){
        super(make,model,year,weight);
        isDriving = false;
        this.horsepower = 0;
    }

    public Car(String make,String model,int year,int horsepower){
        super(make,model,year);
        isDriving = false;
        this.horsepower = horsepower;
    }

    public Car(String make,String model,int year){
        super(make,model,year);
        isDriving = false;
        this.horsepower = 0;
    }

    public Car(String make,int horsepower,String model){
        super(make,model);
        isDriving = false;
        this.horsepower = horsepower;
    }

    public Car(String make,String model){
        super(make,model);
        isDriving = false;
        this.horsepower = 0;
    }

    public Car(String make,int horsepower){
        super(make);
        isDriving = false;
        this.horsepower = horsepower;
    }

    public Car(String make){
        super(make);
        isDriving = false;
        this.horsepower = 0;
    }

    public Car(int horsepower){
        super();
        isDriving = false;
        this.horsepower = horsepower;
    }

    public Car(){
        super();
        isDriving = false;
        this.horsepower = 0;
    }

    //Methods that object is doing something

    public void Drive(){
        if(tripsSinceMaintenance_getter() < 100){
            
            isDriving = true;
    
         }
    }

    public void Stop(){

        if(tripsSinceMaintenance_getter() >= 100){

            needsMaintenance_setter(true);
            System.out.println("The car ("+model_getter()+") can't do another trips because needs maintenance (tripsSinceMaintenance = "+tripsSinceMaintenance_getter()+")\n");
        }
        else{
            isDriving = false;
            tripsSinceMaintenance_setter(tripsSinceMaintenance_getter()+1);
        }
    }
             
    
    

    public void repair(){
        if(needsMaintenance_getter() == true){
            tripsSinceMaintenance_setter(0);
            needsMaintenance_setter(false);
        }
        else{
            System.out.println("The car is in good shape\n");
        }
        
    }

    //Display the object
    public String toString(){

        return "|Make: "+make_getter().toString()+"|Model: "+model_getter().toString()+"|Year: "+year_getter()+"|Weight: "+weight_getter()+"|Needs Maintenance: "+needsMaintenance_getter()+"|Trips since maintenance: "+tripsSinceMaintenance_getter()+"|isDriving: "+isDriving+"|Horsepower: "+horsepower+"|\n";
    }

}