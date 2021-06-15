class ProjectTest{
    public static void main(String[] args) {
        Project first = new Project();
        first.setName("Takamol");
        System.out.println(first.getName());

        // Project second = new Project(); //if I create a new empty object it will run with same result!
        Project second = new Project("Electrical Company");
        second.setDescription("We sell the electrical parts");
        System.out.println(second.getDescription());
        
        Project third = new Project("Farm" , "Planting the Flowers");
        System.out.println(third.elevatorPitch());
        
    }
}