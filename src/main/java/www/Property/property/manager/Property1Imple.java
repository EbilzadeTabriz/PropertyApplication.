package www.Property.property.manager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import www.Property.property.dto.Property1Dto;
import www.Property.property.dto.respnseRequest.Property1Request;
import www.Property.property.exception.Property1NotFound;
import www.Property.property.pagination.Property1PageResponse;
import www.Property.property.entity.Property1;
import www.Property.property.mapper.Property1Mapper;
import www.Property.property.repository.Property1Repository;
import www.Property.property.service.Property1Service;


@Service
@RequiredArgsConstructor
public class Property1Imple implements Property1Service {
    private final Property1Repository property1Repository;
    private final Property1Mapper property1Mapper;


    @Override
    public Property1PageResponse getAll(int page, int count) {

        Page<Property1> property1Page = property1Repository.findAll(PageRequest.of(page, count));
        return new Property1PageResponse(property1Page.getContent().stream().map(property1Mapper::toProperty1Dto).toList(),
                property1Page.getTotalElements(),
                property1Page.getTotalPages(),
                property1Page.hasNext());

    }

    @Override
    public Property1Dto getById(Long id) {
        return property1Repository
                .findById(id)
                .stream()
                .map(property1Mapper::toProperty1Dto)
                .findFirst()
                .orElseThrow(()->new Property1NotFound("Property not found with ID:"  + id));
    }

    @Override
    public void deleteAll() {
        property1Repository.deleteAll();

    }

    @Override
    public void deleteById(Long id) {
        property1Repository.deleteById(id);

    }

    @Override
    public void updateProperty(Long id, Property1 property1) {
        Property1 updated = property1Repository.findById(id).get();
        updated.setPropertyId(property1.getPropertyId());
        updated.setCity(property1.getCity());
        updated.setDistirict(property1.getDistirict());
        updated.setBedrooms(property1.getBedrooms());
        updated.setBathroom(property1.getBathroom());
        updated.setTitle(property1.getTitle());
        updated.setPrice(property1.getPrice());
        updated.setContactInformation(property1.getContactInformation());
        property1Repository.save(updated);

    }

    @Override
    public void  saveProperty(Property1Request property1) {
        property1Repository.save(property1Mapper.toProperty1(property1));

        }
    }




