package sample.cafekiosk.spring.api.service.product;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sample.cafekiosk.spring.domain.product.ProductRepository;

@Component
@RequiredArgsConstructor
public class ProductNumberFctory {

    private final ProductRepository productRepository;

    public String createNextProductNumber() {
        //productNumber
        String latestProductNumber = productRepository.findLatestProductNumber();
        if (latestProductNumber == null) {
            return "001";
        }
        int lastestProductNumberInt = Integer.parseInt(latestProductNumber);
        int nextProductNUmberInt = lastestProductNumberInt + 1;
        return String.format("%03d", nextProductNUmberInt);
    }
}
