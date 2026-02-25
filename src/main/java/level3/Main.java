package level3;

public class Main {

    public static void main(String[] args) {
        ReportStrategy csv = title -> "CSV Report: " + title;
        ReportStrategy pdf = title -> "PDF Report: " + title;
        ReportStrategy html = title -> "HTML Report: " + title;
        ReportStrategy excel = title -> "Excel Report: " + title;
        ReportStrategy xml = title -> "XML Report: " + title;
        ReportStrategy json = title -> "JSON Report: " + title;
        ReportStrategy word = title -> "Word Report: " + title;

        ReportService service = new ReportService(csv);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(pdf);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(html);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(excel);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(xml);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(json);
        System.out.println(service.generate("Sales Data"));

        service.setStrategy(word);
        System.out.println(service.generate("Sales Data"));

    }
}
