package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ArticlePage {
    private  final By ARTICLE_TITLE = By.xpath(".//h1[@itemprop = 'headline name']");
    private BaseFunc baseFunc;

    public ArticlePage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }

       // List<WebElement> = baseFunc.ARTICLE_TITLE.getText();

    }


    //String titleToCompare = baseFunc.(TITLE).getText();
//}
