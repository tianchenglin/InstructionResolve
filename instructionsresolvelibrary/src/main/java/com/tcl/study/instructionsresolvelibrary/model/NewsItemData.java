/*
 * Copyright (c) Created by T C L on 2017.5.3.
 * 单条
 */

package com.tcl.study.instructionsresolvelibrary.model;

import java.util.List;

public class NewsItemData {
  private String articleId;//文章id
  private String index;//指令index
  private List<Item> items;

  public String getArticleId() {
    return articleId;
  }

  public void setArticleId(String articleId) {
    this.articleId = articleId;
  }

  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public List<Item> getItems() {
    return items;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }

  private static class Item {
    private String type;//指令类型
    private String operator;//操作类型，`C`-创建，`U`-覆盖，`D`-删除
    private String cardId;//卡片id，如果是卡片类型会存在
    private Info info;
    private List<Day> days;
    private List<Image> images;
    private Card card;

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getOperator() {
      return operator;
    }

    public void setOperator(String operator) {
      this.operator = operator;
    }

    public String getCardId() {
      return cardId;
    }

    public void setCardId(String cardId) {
      this.cardId = cardId;
    }

    public Info getInfo() {
      return info;
    }

    public void setInfo(Info info) {
      this.info = info;
    }

    public List<Day> getDays() {
      return days;
    }

    public void setDays(List<Day> days) {
      this.days = days;
    }

    public List<Image> getImages() {
      return images;
    }

    public void setImages(List<Image> images) {
      this.images = images;
    }

    public Card getCard() {
      return card;
    }

    public void setCard(Card card) {
      this.card = card;
    }

    private static class Card {
      private String id;
      private String icon;
      private String editor;
      private String content;
      private long pubTime;
      private List<String> picLinks;
      private String location;
      private String unit;
      private String hasReporter;
      private String reArticleId;
      private String reContentType;
      private String videoUrl;
      private String articleTitle;
      private String articleUrl;
      private int newsType;
      private String shareTitle;
      private String shareContent;
      private String shareImgUrl;
      private String shareUrl;

      public String getId() {
        return id;
      }

      public void setId(String id) {
        this.id = id;
      }

      public String getIcon() {
        return icon;
      }

      public void setIcon(String icon) {
        this.icon = icon;
      }

      public String getEditor() {
        return editor;
      }

      public void setEditor(String editor) {
        this.editor = editor;
      }

      public String getContent() {
        return content;
      }

      public void setContent(String content) {
        this.content = content;
      }

      public long getPubTime() {
        return pubTime;
      }

      public void setPubTime(long pubTime) {
        this.pubTime = pubTime;
      }

      public List<String> getPicLinks() {
        return picLinks;
      }

      public void setPicLinks(List<String> picLinks) {
        this.picLinks = picLinks;
      }

      public String getLocation() {
        return location;
      }

      public void setLocation(String location) {
        this.location = location;
      }

      public String getUnit() {
        return unit;
      }

      public void setUnit(String unit) {
        this.unit = unit;
      }

      public String getHasReporter() {
        return hasReporter;
      }

      public void setHasReporter(String hasReporter) {
        this.hasReporter = hasReporter;
      }

      public String getReArticleId() {
        return reArticleId;
      }

      public void setReArticleId(String reArticleId) {
        this.reArticleId = reArticleId;
      }

      public String getReContentType() {
        return reContentType;
      }

      public void setReContentType(String reContentType) {
        this.reContentType = reContentType;
      }

      public String getVideoUrl() {
        return videoUrl;
      }

      public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
      }

      public String getArticleTitle() {
        return articleTitle;
      }

      public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
      }

      public String getArticleUrl() {
        return articleUrl;
      }

      public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
      }

      public int getNewsType() {
        return newsType;
      }

      public void setNewsType(int newsType) {
        this.newsType = newsType;
      }

      public String getShareTitle() {
        return shareTitle;
      }

      public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
      }

      public String getShareContent() {
        return shareContent;
      }

      public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
      }

      public String getShareImgUrl() {
        return shareImgUrl;
      }

      public void setShareImgUrl(String shareImgUrl) {
        this.shareImgUrl = shareImgUrl;
      }

      public String getShareUrl() {
        return shareUrl;
      }

      public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
      }
    }

    private static class Image {
      private String imgUrl;
      private String describe;

      public String getImgUrl() {
        return imgUrl;
      }

      public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
      }

      public String getDescribe() {
        return describe;
      }

      public void setDescribe(String describe) {
        this.describe = describe;
      }
    }

    private static class Day {
      private String formatTime;
      private String origin;

      public String getFormatTime() {
        return formatTime;
      }

      public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
      }

      public String getOrigin() {
        return origin;
      }

      public void setOrigin(String origin) {
        this.origin = origin;
      }
    }

    private static class Info {
      private String menuId;//文章所属栏目
      private int liveflage;//1是现场，0表示不是
      private String menuName;//文章所属栏目名称
      private String hasMember;//
      private String memberName;
      private String memberHeadImg;
      private String liveStatus;
      private String hasDate;
      private String hasVideo;//
      private String title;//标题
      private String decribe;//描述
      private String picLinks;//头图链接
      private int height;
      private int width;
      private List<String> videoUrls;
      private List<String> h5VideoUrls;
      private String videopicUrl;
      private int number;
      private String bgimage;
      private String status;
      private String statuscolor;
      private int contentType;
      private int articleId;
      private long pubTime;
      private String shareContent;
      private String shareTitle;
      private String shareImgUrl;
      private String shareUrl;
      private String location;
      private List<String> articlelist;//相关文章

      public String getMenuId() {
        return menuId;
      }

      public void setMenuId(String menuId) {
        this.menuId = menuId;
      }

      public int getLiveflage() {
        return liveflage;
      }

      public void setLiveflage(int liveflage) {
        this.liveflage = liveflage;
      }

      public String getMenuName() {
        return menuName;
      }

      public void setMenuName(String menuName) {
        this.menuName = menuName;
      }

      public String getHasMember() {
        return hasMember;
      }

      public void setHasMember(String hasMember) {
        this.hasMember = hasMember;
      }

      public String getMemberName() {
        return memberName;
      }

      public void setMemberName(String memberName) {
        this.memberName = memberName;
      }

      public String getMemberHeadImg() {
        return memberHeadImg;
      }

      public void setMemberHeadImg(String memberHeadImg) {
        this.memberHeadImg = memberHeadImg;
      }

      public String getLiveStatus() {
        return liveStatus;
      }

      public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
      }

      public String getHasDate() {
        return hasDate;
      }

      public void setHasDate(String hasDate) {
        this.hasDate = hasDate;
      }

      public String getHasVideo() {
        return hasVideo;
      }

      public void setHasVideo(String hasVideo) {
        this.hasVideo = hasVideo;
      }

      public String getTitle() {
        return title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public String getDecribe() {
        return decribe;
      }

      public void setDecribe(String decribe) {
        this.decribe = decribe;
      }

      public String getPicLinks() {
        return picLinks;
      }

      public void setPicLinks(String picLinks) {
        this.picLinks = picLinks;
      }

      public int getHeight() {
        return height;
      }

      public void setHeight(int height) {
        this.height = height;
      }

      public int getWidth() {
        return width;
      }

      public void setWidth(int width) {
        this.width = width;
      }

      public List<String> getVideoUrls() {
        return videoUrls;
      }

      public void setVideoUrls(List<String> videoUrls) {
        this.videoUrls = videoUrls;
      }

      public List<String> getH5VideoUrls() {
        return h5VideoUrls;
      }

      public void setH5VideoUrls(List<String> h5VideoUrls) {
        this.h5VideoUrls = h5VideoUrls;
      }

      public String getVideopicUrl() {
        return videopicUrl;
      }

      public void setVideopicUrl(String videopicUrl) {
        this.videopicUrl = videopicUrl;
      }

      public int getNumber() {
        return number;
      }

      public void setNumber(int number) {
        this.number = number;
      }

      public String getBgimage() {
        return bgimage;
      }

      public void setBgimage(String bgimage) {
        this.bgimage = bgimage;
      }

      public String getStatus() {
        return status;
      }

      public void setStatus(String status) {
        this.status = status;
      }

      public String getStatuscolor() {
        return statuscolor;
      }

      public void setStatuscolor(String statuscolor) {
        this.statuscolor = statuscolor;
      }

      public int getContentType() {
        return contentType;
      }

      public void setContentType(int contentType) {
        this.contentType = contentType;
      }

      public int getArticleId() {
        return articleId;
      }

      public void setArticleId(int articleId) {
        this.articleId = articleId;
      }

      public long getPubTime() {
        return pubTime;
      }

      public void setPubTime(long pubTime) {
        this.pubTime = pubTime;
      }

      public String getShareContent() {
        return shareContent;
      }

      public void setShareContent(String shareContent) {
        this.shareContent = shareContent;
      }

      public String getShareTitle() {
        return shareTitle;
      }

      public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
      }

      public String getShareImgUrl() {
        return shareImgUrl;
      }

      public void setShareImgUrl(String shareImgUrl) {
        this.shareImgUrl = shareImgUrl;
      }

      public String getShareUrl() {
        return shareUrl;
      }

      public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
      }

      public String getLocation() {
        return location;
      }

      public void setLocation(String location) {
        this.location = location;
      }

      public List<String> getArticlelist() {
        return articlelist;
      }

      public void setArticlelist(List<String> articlelist) {
        this.articlelist = articlelist;
      }
    }

  }
}
