package Project;

public class Exercise {
    public String name;
    public String type;
    public String instructions;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    @Override
    public String toString() {

        return "Name: " + name + ", Type" + type + ", Description: " + instructions;

    }
}