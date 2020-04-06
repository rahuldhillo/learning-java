package com.rahuldhillo.basics.implementiterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;


public class UrlLibrary2 implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();

    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while( (line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("n");
                }

                br.close();

            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            urls.remove(index);
        }

    }

    public UrlLibrary2() {
        urls.add("https://www.caveofprogramming.com/java-collections-framework/using-iterable-java-collections-framework-video-tutorial-part-11.html");
        urls.add("http://www.facebook.com/caveofprogramming");
        urls.add("http://news.bbc.co.uk");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */


}