import level3.ReportService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReportServiceTest {

    @Test
    void csvCorrectFormat() {
        ReportService service = new ReportService(title -> "CSV" + title);
        assertTrue(service.generate("Test Report").startsWith("CSV"));
    }

    @Test
    void pdfCorrectFormat() {
        ReportService service = new ReportService(title -> "PDF" + title);
        assertTrue(service.generate("Test Report").startsWith("PDF"));
    }

    @Test
    void htmlCorrectFormat() {
        ReportService service = new ReportService(title -> "HTML" + title);
        assertTrue(service.generate("Test Report").startsWith("HTML"));
    }

    @Test
    void strategyChangesInExecutionTime() {
        ReportService service = new ReportService(title -> "CSV" + title);
        assertTrue(service.generate("Test Report").startsWith("CSV"));
        service.setStrategy(title -> "PDF" + title);
        assertTrue(service.generate("Test Report").startsWith("PDF"));
    }
}
