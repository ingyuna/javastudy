package ex17_Object.ex04;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

	// field
	private String model;  // 모델
	private String manufacturer;   // 제조사
	private String date;   // 제조일자
	
	// method
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;       // = p1.equals(p1)
		}
		if (obj instanceof Product) {   // p1.equals(p2)
			Product p = (Product)obj;
			// 모델과 제조사를 비교해서 동일하면 true 반환, 아니면 false 반환
			// p1.equals(p2)인 경우
			// p1의 모델 : model (this.model)
			// p2의 모델 : p.model
			if ( model.equals(p.model) && manufacturer.equals(p.manufacturer) ) {
				return true;
			} else {
				return false;
			}
			
		}
		return false;    // 애초에 obj가 Product이 아님
	}
	
	
	
	
	
	
	
}
