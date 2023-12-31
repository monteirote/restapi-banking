package me.dio.restapibanking.model;

import java.util.List;

public class UserDTO {

    private Long id;
    private String name;
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public UserDTO(Long id, String name, Account account, Card card, List<Feature> features, List<News> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.card = card;
        this.features = features;
        this.news = news;
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.account = user.getAccount();
        this.card = user.getCard();
        this.features = user.getFeatures();
        this.news = user.getNews();
    }
}
