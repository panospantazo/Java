class Exersice{
    public static void main(String args[]){
        
        int i = 0;
        boolean F = false;

        System.out.println("CARS");
        System.out.println("----");

        Car a = new Car("ford","sportscar",2020,125.65f,500);
        Car b = new Car("BMW","jeep",2015,500.23f,350);
        Car c = new Car("Mini-Couper","Family",2010,200.0f,154);

        for(i = 0;i<109;i++){
            if(a.needsMaintenance_getter() == false){
                a.Drive();
                a.Stop();
            }
            else{
                break;
            }            
        }

        for(i = 0;i<30;i++){
            if(b.needsMaintenance_getter() == false){
                b.Drive();
                b.Stop();
            }
            else{
                break;
            }
        }   

        for(i = 0;i<55;i++){
            if(c.needsMaintenance_getter() == false){
                c.Drive();
                c.Stop();
            }
            else{
                break;
            }
        }   
        
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        System.out.println("PLANES");
        System.out.println("------");

        Plane a1 = new Plane("la","F-16",2000,800f,125f);
        Plane b2 = new Plane("lala","F-18",2010,899.23f,200f);
        Plane c3 = new Plane("lalala","F-22",2023,1000.32f,500.43f);

        for(i = 0;i<109;i++){
                a1.Fly();
                a1.Land();
                if(a1.needsMaintenance_getter()){
                    break;
                }  
        }

    for(i = 0;i<52;i++){
        b2.Fly();
        b2.Land();
        if(b2.needsMaintenance_getter()){ 
               break;
        } 
    }
    
    for(i = 0;i<11;i++){
        c3.Fly();
        c3.Land();
        if(c3.needsMaintenance_getter()){
            break;
    }  
}
      
        System.out.println(a1.toString());
        System.out.println(b2.toString());
        System.out.println(c3.toString());

    }
}