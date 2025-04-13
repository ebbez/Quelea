module org.quelea {
    // javax.xml & javax.persistence
    requires jakarta.persistence;
    requires java.xml;
    requires java.desktop;

    // LibreOffice
    requires org.libreoffice.uno;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;
    requires org.apache.poi.ooxml.schemas;
    requires org.apache.poi.scratchpad;

    requires java.logging;
    requires org.apache.commons.io;

    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.xmlgraphics.fop.core;

    requires jdk.httpserver;

    requires org.apache.lucene.core;
    requires org.apache.lucene.analysis.common;
    requires org.apache.lucene.queryparser;

    requires org.hibernate.orm.core;

    requires org.json;
    requires com.google.gson;

    requires aparapi;
    requires paradoxdriver;

    // TODO:
    // Quelea specifics
    requires jopenlyrics;
    requires planning.center;

    // JavaFX packages
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.fxml;

    // Exported packages
    exports org.quelea.data;
    exports org.quelea.data.bible;
    exports org.quelea.data.chord;
    exports org.quelea.data.db;
    exports org.quelea.data.db.model;
    exports org.quelea.data.displayable;
    exports org.quelea.data.imagegroup;
    exports org.quelea.data.pdf;
    exports org.quelea.data.powerpoint;

    exports org.quelea.server;
    exports org.quelea.services.importexport;
    exports org.quelea.services.languages;
    exports org.quelea.services.languages.spelling;
    exports org.quelea.services.livetext;
    exports org.quelea.services.lucene;
    exports org.quelea.services.notice;
    exports org.quelea.services.print;
    exports org.quelea.services.utils;

    exports org.quelea.utils;

    exports org.quelea.windows.help;
    exports org.quelea.windows.image;
    exports org.quelea.windows.imagegroup;
    exports org.quelea.windows.library;
    exports org.quelea.windows.lyrics;
    exports org.quelea.windows.main;
    exports org.quelea.windows.main.actionhandlers;
    exports org.quelea.windows.main.menus;
    exports org.quelea.windows.main.quickedit;
    exports org.quelea.windows.main.schedule;
    exports org.quelea.windows.main.toolbars;
    exports org.quelea.windows.main.widgets;
    exports org.quelea.windows.multimedia;
    exports org.quelea.windows.newsong;
    exports org.quelea.windows.options;
    exports org.quelea.windows.options.customprefs;
    exports org.quelea.windows.pdf;
    exports org.quelea.windows.presentation;
    exports org.quelea.windows.splash;
    exports org.quelea.windows.stage;
    exports org.quelea.windows.timer;
    exports org.quelea.windows.video;
    exports org.quelea.windows.web;

    exports org.javafx.dialog;

    // Opened for reflection (FXML controllers)
    opens org.quelea.services.importexport to javafx.fxml;

}