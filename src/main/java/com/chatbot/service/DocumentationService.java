package com.chatbot.service;

import com.chatbot.model.Documentation;
import com.chatbot.repository.DocumentationRepository;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentationService {

    private final DocumentationRepository documentationRepository;

    public DocumentationService(DocumentationRepository documentationRepository) {
        this.documentationRepository = documentationRepository;
    }

    public void scrapeAndStoreDocumentation() {
        try {
            String url = "https://docs.zeotap.com/home/en-us/";
            Document doc = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0")
                    .timeout(10000)
                    .get();

            Elements elements = doc.select("p, div, span, li");
            for (Element element : elements) {
                Documentation docEntry = new Documentation();
                docEntry.setTitle("Zeotap Documentation");
                docEntry.setContent(element.text());
                documentationRepository.save(docEntry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Documentation> getAllDocs() {
        return documentationRepository.findAll();
    }
}
