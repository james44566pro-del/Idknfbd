// Recovered Java — original comments and some names are not available.
package net.fabric;

import java.nio.charset.StandardCharsets;
import java.util.Map;

public class valLbdju$EiiWdHlJK {
   public final int statusCode;
   public final String statusLine;
   public final Map<String, String> headers;
   public final byte[] body;

   valLbdju$EiiWdHlJK(int statusCode, String statusLine, Map<String, String> headers, byte[] body) {
      Hg_op.statusCode = enMS_cWGK_RdAy_kaOF;
      Hg_op.statusLine = C3o;
      Hg_op.headers = tmpOut;
      Hg_op.body = ddwN_KZDF_tohh_RATp;
   }

   public String bodyString() {
      return new String(jIdx.body, StandardCharsets.UTF_8);
   }

   public String header(String name) {
      return (String)hoQa_GeAg_mFcl_kDfF.headers.get(yq_YUFDI.toLowerCase());
   }
}
