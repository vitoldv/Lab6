package org.example.Classes;

import lombok.*;

@Getter@Setter@AllArgsConstructor
@ToString(includeFieldNames = false)
public abstract class Product {
    @ToString.Include(rank=2)
    public String name;
    @ToString.Include(rank=1)
    public final String type;
}
