package org.duksung.test.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefaultRes<T> {

    //Response TestData
    private T responseData;

    public static<T> DefaultRes<T> res() {
        return res(null);
    }

    public static<T> DefaultRes<T> res(final T t) {
        return DefaultRes.<T>builder()
                .responseData(t)
                .build();
    }
}
