class ParkingSystem {
    Map<Integer,Integer> park;

    public ParkingSystem(int big, int medium, int small) {
        park = new HashMap<>();
        park.put(1,big);
        park.put(2,medium);
        park.put(3,small);
        
    }
    
    public boolean addCar(int carType) {
        if(park.get(carType)!=0){
            park.put(carType,park.get(carType)-1);
            return true;
        }
        return false;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */