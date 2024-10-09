
import java.util.List;


public class Rule {
    private List<String> antecedent;
        private String consequent;

        public Rule(List<String> antecedent, String consequent) {
            this.antecedent = antecedent;
            this.consequent = consequent;
        }

        public List<String> getAntecedent() {
            return antecedent;
        }

        public String getConsequent() {
            return consequent;
        }
}
