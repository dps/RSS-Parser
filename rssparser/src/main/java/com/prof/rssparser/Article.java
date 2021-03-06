/*
*   Copyright 2016 Marco Gomiero
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*
*/

package com.prof.rssparser;

import java.util.Date;

/**
 * Created by Marco Gomiero on 12/02/2015.
 */
public class Article {

    private String title;
    private String author;
    private String link;
    private Date pubDate;
    private String description;
    private String content;
    private String image;

    public class Enclosure {
        public String url;
        public String mimeType;
        public String length;
    }
    private Enclosure enclosure;
    private String duration;

    public String getTitle() {

        return title;

    }

    public String getAuthor() {

        return author;

    }

    public String getLink() {

        return link;

    }

    public Date getPubDate() {

        return pubDate;

    }

    public String getDescription() {

        return description;

    }

    public String getContent() {

        return content;

    }

    public String getImage() {

        return image;

    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public String getDuration() {
        return duration;
    }

    public void setTitle(String title) {

        this.title = title;

    }

    public void setAuthor(String author) {

        this.author = author;

    }

    public void setLink(String link) {

        this.link = link;

    }

     public void setPubDate(Date pubDate) {

        this.pubDate = pubDate;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public void setContent(String content) {

        this.content = content;

    }

    public void setImage(String image) {

        this.image = image;

    }

    public void setEnclosure(String length, String url, String type) {
        this.enclosure = new Enclosure();
        this.enclosure.length = length;
        this.enclosure.url = url;
        this.enclosure.mimeType = type;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {

        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", link='" + link + '\'' +
                ", pubDate=" + pubDate +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                '}';

    }

}