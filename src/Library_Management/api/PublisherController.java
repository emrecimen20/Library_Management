package com.emre.Library_Management.api;

import com.emre.Library_Management.business.abstracts.IPublisherService;
import com.emre.Library_Management.core.result.ResultData;
import com.emre.Library_Management.core.utilies.ResultHelper;
import com.emre.Library_Management.dto.request.PublisherSaveRequest;
import com.emre.Library_Management.dto.response.PublisherResponse;
import com.emre.Library_Management.entity.Publisher;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/publishers")
public class PublisherController {

    private final IPublisherService publisherService;

    public PublisherController(IPublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private ResultData<PublisherResponse> save(@Valid @RequestBody PublisherSaveRequest publisherSaveRequest) {

        Publisher publisher = new Publisher(
                publisherSaveRequest.getName(),
                publisherSaveRequest.getEstablishmentYear(),
                publisherSaveRequest.getAddress(),
                publisherSaveRequest.getBookList()
        );

        this.publisherService.save(publisher);

        PublisherResponse publisherResponse = new PublisherResponse(
                publisher.getId(),
                publisher.getName(),
                publisher.getEstablishmentYear(),
                publisher.getAddress(),
                publisher.getBookList()
        );

        return ResultHelper.created(publisherResponse);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<Publisher> get() {
        return this.publisherService.get();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    private ResultData<Publisher> delete(@PathVariable("id")int id) {
        Publisher deletedPublisher = this.publisherService.getById(id);
        this.publisherService.delete(id);
        return ResultHelper.deleted(deletedPublisher);
    }

}
