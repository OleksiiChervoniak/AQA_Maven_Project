package model;

public class ApiQuote {
    private Integer id;
    private String quote;

    public ApiQuote(Integer id, String quote) {
        this.id = id;
        this.quote = quote;
    }

    public Integer getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
