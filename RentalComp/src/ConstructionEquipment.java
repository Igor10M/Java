public class ConstructionEquipment extends Equipment {
    private String condition;

    public ConstructionEquipment(String name, double rentValue, String condition) {
        super(name, rentValue);
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}

