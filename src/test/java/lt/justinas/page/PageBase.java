package lt.justinas.page;

public class PageBase {
    public static void open(String url, int seconds) {
        Common.setUpDriver(seconds);
        Common.openUrl(url);
    }
}
