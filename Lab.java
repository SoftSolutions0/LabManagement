public class Lab {
    private String name;
    private Employee labAttendant;
    private PC[] computers = new PC[100];

    public Lab(String name, Employee labAttendant) {
        this.name = name;
        this.labAttendant = labAttendant;
    }

    public Lab(Lab other){
        this.name = other.getName();
        this.labAttendant = other.getLabAttendant();
        this.computers = other.getComputers();
    }

    public PC[] getComputers() {
        return this.computers;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void addPC(PC pc){
        for (int i = 0; i < computers.length; i++) {
            if(computers[i] == null){
                computers[i] = pc;
                break;
            }
        }
    }

    public void printPCs(){
        for(PC computer: computers){
            if (computer != null){
                System.out.println(computer);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Lab Attendant: %s; ", name, labAttendant);
    }

    public void removePC(PC pc){
        for (int i = 0; i < computers.length; i++) {
            if(computers[i].equals(pc)){
                computers[i] = null;
                break;
            }
        }
    }

}
