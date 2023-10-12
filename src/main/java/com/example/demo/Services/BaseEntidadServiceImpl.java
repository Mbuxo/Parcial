package com.example.demo.Services;

import com.example.demo.Entities.BaseEntidad;
import com.example.demo.Repositories.BaseEntidadRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseEntidadServiceImpl<E extends BaseEntidad, ID extends Serializable> implements BaseEntidadService<E, ID> {
    protected BaseEntidadRepository<E, ID> baseEntidadRepository;

    public BaseEntidadServiceImpl(BaseEntidadRepository<E, ID> baseEntidadRepository) {
        this.baseEntidadRepository = baseEntidadRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseEntidadRepository.findAll();
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception{
        try{
            Page<E> entities = baseEntidadRepository.findAll(pageable);
            return entities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseEntidadRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseEntidadRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> opt = baseEntidadRepository.findById(id);
            if (opt.isEmpty()) {
                throw new Exception();
            }
            E oldValue = opt.get();
            entity.setId(oldValue.getId());

            E saved = baseEntidadRepository.save(entity);

            return saved;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }


    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if (baseEntidadRepository.existsById(id)) {
                baseEntidadRepository.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}