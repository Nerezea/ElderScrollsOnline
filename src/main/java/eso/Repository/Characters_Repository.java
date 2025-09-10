package eso.Repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import eso.Chars.Characters;

public interface Characters_Repository
		extends
		Repository<Characters, Integer> {

	List<Characters> findByNameLike(String name);

}
