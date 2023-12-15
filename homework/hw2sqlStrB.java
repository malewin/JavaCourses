// Дана строка sql-запроса "select * from students where"
// Сформируйте часть where этого запроса, используя StringBuilder. Пример данных для фильтрации
// приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос
// пример: {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
// напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса
// String PARAMS - JSON  с параметрами

package homework;

public class hw2sqlStrB {
    
    public static void main(String[] args) {
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String query = "select * from students where ";
        String res = (Answer.answer(query, params)).toString();
        System.out.println(res);
        
        
    }
    class Answer {
        public static StringBuilder answer(String QUERY, String PARAMS){
            String separator = PARAMS.replace("{", "").replace("}", "").replace("\"", "");
            String name = separator.split(",")[0].split(":")[1];
            String country =  separator.split(",")[1].split(":")[1];
            String city =  separator.split(",")[2].split(":")[1];
            String age =  separator.split(",")[3].split(":")[1];
            
            StringBuilder result = new StringBuilder(QUERY);
            
            if (!name.equals("null")){
                result.append("name=").append("'").append(name).append("'");
            }
            
            if (!country.equals("null")){
                result.append(" and ");
            }
            if (!country.equals("null")){
                result.append("country=").append("'").append(country).append("'");
            }
            
            if (!city.equals("null")){
                result.append(" and ");
            }
            if (!city.equals("null")){
                result.append("city=").append("'").append(city).append("'");
            }
            
            if (!age.equals("null")){
                result.append(" and ");
            }
            if (!age.equals("null")){
                result.append("age=").append("'").append(age).append("'");
            }

            return result;
        }
    }
    
}
