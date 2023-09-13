package io.getarrays.server.resource;

import io.getarrays.server.model.Response;
import io.getarrays.server.service.implementation.ServerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.time.LocalDateTime.now;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
    private final ServerServiceImpl serverService;
    public ResponseEntity<Response> getServers(){
        return new ResponseEntity.ok(
                Response.builder().
                        timestamp(now())
                        .data(Map.of("servers", serverService.list(30)))
        );
    }
}
