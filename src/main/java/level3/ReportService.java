package level3;

public class ReportService {

    private ReportStrategy strategy;

    public ReportService(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public String generate(String title) {
        return strategy.generate(title);
    }
}
