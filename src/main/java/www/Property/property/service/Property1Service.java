package www.Property.property.service;

import www.Property.property.dto.Property1Dto;
import www.Property.property.dto.respnseRequest.Property1Request;
import www.Property.property.pagination.Property1PageResponse;
import www.Property.property.entity.Property1;

public interface Property1Service {
  public Property1PageResponse getAll(int page, int count);
  Property1Dto getById(Long id);
  void deleteAll();
  void deleteById(Long id);
  void updateProperty(Long id,Property1 property1);
  void saveProperty(Property1Request property1Request);
}
