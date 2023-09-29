package www.Property.property.pagination;

import www.Property.property.dto.Property1Dto;

import java.util.List;

public record Property1PageResponse (
        List<Property1Dto> property1,
        long totalElements,
        int totalPages,
        boolean hasNext

) {
}
