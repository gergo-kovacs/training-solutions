package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        StringBuilder sb = new StringBuilder();
        if (title != null) {
            sb.append(title.getTitulus() + ". ");
        }
        if(!isEmpty(givenName)){
            sb.append(givenName + " ");
        }
        if(!isEmpty(middleName)){
        sb.append(middleName + " ");
        }
        if(!isEmpty(familyName)){
            sb.append(familyName);
        }
        return sb.toString();
    }

        public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
            StringBuilder sb = new StringBuilder();
            if (title != null) {
                sb.append(title.getTitulus() + ". ");
            }
            if(!isEmpty(familyName)){
                sb.append(familyName + " ");
            }else{
                throw new IllegalArgumentException("Family name and given name must not be empty!");
            }
            if(!isEmpty(middleName)){
                sb.append(middleName + " ");
            }
            if(!isEmpty(givenName)){
                sb.append(givenName);
            }else{
                throw new IllegalArgumentException("Family name and given name must not be empty!");
            }
            return sb.toString();
        }

        public String insertTitle(String name, Title title, String where){
           String[] strings = (name.split(where,2));
           return strings[0]+where+title.getTitulus()+"."+where+strings[1];
        }

        public String deleteNamePart(String name, String delete){

        return name.replaceAll(delete,"");
        }

        private boolean isEmpty(String param){

        return (param == "" || param == null) ? true : false;
        }

}
