package com.example.minato.template.converter;

import com.example.minato.template.OrderDetail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by minato on 9/15/2017.
 */

public class OrderDetailConverter {

    public static UserDetailItem createUserDatail(String name) {
        UserDetailItem userDetailItem = new UserDetailItem();
        userDetailItem.setName(name);
        return userDetailItem;
    }


    public static TitleItem createTitle(String yourOrderTitle) {
        TitleItem titleItem = new TitleItem();
        titleItem.setTitle(yourOrderTitle);
        return titleItem;
    }


    public static TotalItem createTotal(OrderDetail orderDetail, String currency) {
        TotalItem totalItem = new TotalItem();
        totalItem.setTotalPrice(gettotalPrice(orderDetail) + currency);
        return null;
    }

    private static int gettotalPrice(OrderDetail orderDetail) {
        int totalPrice = 0;
        totalPrice += gettotalFoodPrice(orderDetail.getFoodList());
        totalPrice += gettotalBookPrice(orderDetail.getBookList());
        totalPrice += gettotalMusicPrice(orderDetail.getMusicList());
        return totalPrice;
    }

    private static int gettotalMusicPrice(List<OrderDetail.Music> musicList) {
        int totalMusicPrice = 0;
        if (musicList != null) {
            for (OrderDetail.Music music : musicList) {
                totalMusicPrice += music.getPrice();
            }
        }
        return totalMusicPrice;
    }

    private static int gettotalBookPrice(List<OrderDetail.Book> bookList) {
        int totalBookPrice = 0;
        if (bookList != null) {
            for (OrderDetail.Book book : bookList) {
                totalBookPrice += book.getPrice();
            }
        }
        return totalBookPrice;
    }

    private static int gettotalFoodPrice(List<OrderDetail.Food> foodList) {
        int totalFoodPrice = 0;
        if (foodList != null) {
            for (OrderDetail.Food food : foodList) {
                totalFoodPrice += food.getPrice();
            }
        }
        return totalFoodPrice;
    }


    public static NoticeItem createNotice() {
        return new NoticeItem();
    }


    public static ButtonItem createButton() {
        return new ButtonItem();
    }


    public static EmptyItem createEmpty() {
        return new EmptyItem();
    }


    public static List<BaseOrderDetailItem> createSectionAndOrder(
            OrderDetail orderDetail, String foodTitle, String bookTitle,
            String musicTitle, String currency) {
        List<BaseOrderDetailItem> orderDetailItemList = new ArrayList<>();
        orderDetailItemList.addAll(getFoodOrderDetailList(orderDetail.getFoodList(), foodTitle, currency));
        orderDetailItemList.addAll(getBookOrderDetailList(orderDetail.getBookList(), bookTitle, currency));
        orderDetailItemList.addAll(getMusicOrderDetailList(orderDetail.getMusicList(), musicTitle, currency));

        return orderDetailItemList;
    }

    private static List<BaseOrderDetailItem> getMusicOrderDetailList(List<OrderDetail.Music> musicList, String musicTitle, String currency) {
        List<BaseOrderDetailItem> musicOrderDetailList = new ArrayList<>();
        if (musicList != null&& musicList.size()>0){
            musicOrderDetailList.add(createSection(musicTitle));
            for (OrderDetail.Music music :musicList){
                String name = music.getAlbum();
                String detail = music.getArtist();
                String price = music.getPrice() + currency;
                musicOrderDetailList.add(createOrder(name,detail,price));
            }
        }
        return musicOrderDetailList;
    }


    private static List<BaseOrderDetailItem> getFoodOrderDetailList(List<OrderDetail.Food> foodList, String foodTitle, String currency) {
        List<BaseOrderDetailItem> foodOrderDetailList = new ArrayList<>();
        if (foodList != null && foodList.size() > 0)
            foodOrderDetailList.add(createSection(foodTitle));
        for (OrderDetail.Food food : foodList) {
            String name = food.getOrderName();
            String detail = "x" + food.getAmount();
            String price = food.getPrice() + currency;
            foodOrderDetailList.add(createOrder(name, detail, price));
        }
        return foodOrderDetailList;
    }

    private static List<BaseOrderDetailItem> getBookOrderDetailList(List<OrderDetail.Book> bookList, String bookTitle, String currency) {
        List<BaseOrderDetailItem> bookorderDetailList = new ArrayList<>();
            if (bookList != null && bookList.size() >0){
                bookorderDetailList.add(createSection(bookTitle));
                for (OrderDetail.Book book : bookList){
                    String name = book.getBookName();
                    String detail = book.getAuthor();
                    String price = book.getPrice() + currency;
                    bookorderDetailList.add(createOrder(name,detail,price));
                }
            }
        return bookorderDetailList;
    }

    private static OrderItem createOrder(String name, String detail, String price) {
        OrderItem orderItem = new OrderItem();
        orderItem.setName(name);
        orderItem.setDetail(detail);
        orderItem.setPrice(price);
        return orderItem;
    }

    private static SectionItem createSection(String title) {
        SectionItem sectionItem = new SectionItem();
        sectionItem.setSection(title);
        return sectionItem;
    }


    public static List<SummaryItem> createSummary(OrderDetail orderDetail, String foodTitle, String bookTitle, String musicTitle, String currency) {
        List<SummaryItem> summaryItemList = new ArrayList<>();
        if (orderDetail != null){
            summaryItemList.addAll(getFoodSummary(orderDetail.getFoodList(),foodTitle,currency));
            summaryItemList.addAll(getBookSummary(orderDetail.getBookList(),bookTitle,currency));
            summaryItemList.addAll(getMusicSummary(orderDetail.getMusicList(),musicTitle,currency));
        }
        return summaryItemList;
    }

    private static List<SummaryItem> getFoodSummary(List<OrderDetail.Food> foodList, String foodTitle, String currency) {
        List<SummaryItem> foodSummary = new ArrayList<>();
        if (foodList != null && foodList.size() >0){
            
        }
        return null;
    }

}
