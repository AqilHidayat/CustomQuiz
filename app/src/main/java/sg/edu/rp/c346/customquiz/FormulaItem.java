package sg.edu.rp.c346.customquiz;

/**
 * Created by 16019623 on 16/7/2018.
 */

public class FormulaItem {

    private String title;
    private String formula;
    private String type;

    public FormulaItem(String title, String formula, String type) {
        this.title = title;
        this.formula = formula;
        this.type = type;
    }

    public String getType(){
        return  type;
    }

    public String setType(){
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "FormulaItem{" +
                "title='" + title + '\'' +
                ", formula='" + formula + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
