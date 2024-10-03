package com.kb.controller.teacher;

import com.kb.stock.domain.StockNews;
import com.kb.stock.dto.RateHistoryDTO;
import com.kb.stock.dto.StockNewsRequest;
import com.kb.stock.service.StockService;
import com.kb.stockNews.dto.StockNewsDTO;
import io.swagger.annotations.Api;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher/stock")
@RequiredArgsConstructor
@Slf4j
@Api(value = "TeacherStockController", tags = "선생님 주식 관리 페이지")
@PropertySource({"classpath:/application.properties"})
public class TeacherStockController {

    private final StockService stockService;

    @GetMapping("/rate-history")
    public ResponseEntity<List<RateHistoryDTO>> getRateHistoryLast5Days() {
        List<RateHistoryDTO> historyLast5Days = stockService.getRateHistoryLast5Days();
        return ResponseEntity.ok(historyLast5Days);
    }

    @PostMapping("/rate-apply")
    public ResponseEntity<RateHistoryDTO> createRate(@RequestBody RateHistoryDTO rateHistoryDTO) {
        RateHistoryDTO rateHistory = stockService.createRateHistory(rateHistoryDTO);

        return ResponseEntity.ok(rateHistory);
    }

    @GetMapping("/news/list")
    public ResponseEntity<List<StockNews>> getStockNewsList() {
        List<StockNews> newsList = stockService.getStockNewsList();
        return ResponseEntity.ok(newsList);
    }

    @PostMapping("/news")
    public ResponseEntity<StockNews> createNews(@RequestBody StockNewsRequest request) {
        StockNews stockNews = stockService.createStockNews(request);

        return ResponseEntity.ok(stockNews);
    }
}