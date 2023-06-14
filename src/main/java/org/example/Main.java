package org.example;

import com.microsoft.playwright.*;


public class Main {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            BrowserType.LaunchOptions options = new BrowserType.LaunchOptions();
            options.setHeadless(false);
            Browser browser = playwright.chromium().launch(options);
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }
    }
}