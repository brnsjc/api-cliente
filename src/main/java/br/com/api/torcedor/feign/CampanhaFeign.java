package br.com.api.torcedor.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.api.torcedor.response.CampanhaResponse;

@Service
@FeignClient(name = "campanha", url = "localhost:8082")
public interface CampanhaFeign {

	@GetMapping("/api/campanhas")
	List<CampanhaResponse> getCampanhas();
}
