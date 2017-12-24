
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chen1
 */
public class NewClass {
     public static void main(String[] args) throws IOException {
    String a="<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<title>Document</title>\n" +
"	<link rel=\"stylesheet\" href=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css\">  \n" +
"	<script src=\"http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js\"></script>\n" +
"	<script src=\"http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n" +
"	<link href=\"http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.css\" rel=\"stylesheet\"/> \n" +
"\n" +
"\n" +
"	<script type=\"text/javascript\" src=\"bo.js\"></script>\n" +
"	<script type=\"text/javascript\" src=\"jquery-3.0.0.js\"></script>\n" +
"	<link rel=\"stylesheet\" href=\"bo.css\">\n" +
"\n" +
"</head>\n" +
"<body>\n" +
"\n" +
"	<div class=\"table\">\n" +
"\n" +
"		<div class=\"caption\">生产指令建立\n" +
"		</div>\n" +
"\n" +
"\n" +
"		<div class=\"row l1\">\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>制单时间</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"\n" +
"			</div>\n" +
"		</div>\n" +
"\n" +
"\n" +
"		<div class=\"row\">\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"\n" +
"				<span>客户代码</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>客户简称</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>源单类型</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>源单号</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>自定义号</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>款号</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"\n" +
"		</div>\n" +
"\n" +
"\n" +
"		<div class=\"row l3\">\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>品名&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>订单总数</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>预补总数</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>制造数</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>下单时间</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"			<div class=\"col-md-2 col-xs-2\">\n" +
"				<span>版本</span>\n" +
"				<input type=\"text\" name=\"text\">\n" +
"			</div>\n" +
"		</div>\n" +
"	</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"	\n" +
"	<div id=\"index\">\n" +
"\n" +
"		<div class=\"row\">\n" +
"		<div class=\"col-md-7\">\n" +
"			\n" +
"\n" +
"		<div id=\"tab\">\n" +
"\n" +
"			<ul id=\"myTab\" class=\"nav nav-tabs\">\n" +
"	<li class=\"active\">\n" +
"		<a href=\"#home\" data-toggle=\"tab\"> 哈哈</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		  <a href=\"#ios\" data-toggle=\"tab\">iOS</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#img\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#at\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#a5\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#a6\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#b5\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"\n" +
"	<li>\n" +
"		 <a href=\"#b6\" data-toggle=\"tab\">产品图片</a>\n" +
"	</li>\n" +
"	<li></li>\n" +
"            </ul>\n" +
"\n" +
"			<div id=\"myTabContent\" class=\"tab-content\">\n" +
"\n" +
"				<div class=\"tab-pane fade in active\" id=\"home\">\n" +
"					<table id=\"tabl\">\n" +
"						<tr>\n" +
"							<td>规格</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>基本单位</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>客户款号</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"\n" +
"\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td >规格</td>\n" +
"							<td colspan=\"3\"> <input type=\"text\" name=\"text\" id=\"t\"></td>\n" +
"							\n" +
"							\n" +
"							<td>规格</td>\n" +
"							<td> <input type=\"text\" name=\"text\"></td>\n" +
"\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>规格</td>\n" +
"							<td> <input type=\"text\" name=\"text\"></td>\n" +
"							<td >规格</td>\n" +
"							<td colspan=\"3\"> <input type=\"text\" name=\"text\" id=\"t\"></td>\n" +
"							\n" +
"							\n" +
"							\n" +
"\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>规格</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>业务员</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>订单交期</td>\n" +
"							<td><input type=\"date\" name=\"date\"></td>\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>规格</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>业务员</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>订单交期</td>\n" +
"							<td><input type=\"date\" name=\"date\"></td>\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>产品要求</td>\n" +
"							<td colspan=\"5\"><textarea cols=\"80\" rows=\"3\"></textarea></td>\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>规格</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>业务员</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"							<td>订单交期</td>\n" +
"							<td><input type=\"text\" name=\"text\"></td>\n" +
"						</tr>\n" +
"						<tr>\n" +
"							<td>备注</td>\n" +
"							<td colspan=\"5\" ><input type=\"text\" id=\"a\"></td>\n" +
"							\n" +
"						</tr>\n" +
"\n" +
"					</table>\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"ios\">\n" +
"					<p>表格</p>\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"img\">\n" +
"					<p>表格</p>\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"at\">\n" +
"					<p>表格\n" +
"					</p>\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"a5\">\n" +
"					表格\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"a6\">\n" +
"					表格\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"b5\">\n" +
"					表格\n" +
"				</div>\n" +
"				<div class=\"tab-pane fade\" id=\"b6\">\n" +
"					表格\n" +
"				</div>\n" +
"			   </div>\n" +
"\n" +
"		     </div>\n" +
"	</div>\n" +
"\n" +
"	<div class=\"col-md-5\">\n" +
"		<div class=\"row row1\"><button id=\"a666666\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\"><span class=\"glyphicon glyphicon-wrench\"></span>\n" +
"	选择列\n" +
"</button>\n" +
"\n" +
"\n" +
"          \n" +
"		    <div id=\"table0\">\n" +
"		    	\n" +
"			\n" +
"            </div>\n" +
"            \n" +
"          \n" +
"        </div>\n" +
"        <div class=\"row row2\">\n" +
"        	<div id = \"table1\">\n" +
"        	</div>\n" +
"        	\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"</div>\n" +
"</div>\n" +
"<div id=\"ad\">\n" +
"	<table id=\"ad0\">\n" +
"		<tr>\n" +
"			<td>创建人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>修改人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>审核人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>确认人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>审批人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td><input type=\"radio\" name=\"ad1\" value=\"审核已打印\">审核已打印</td>\n" +
"\n" +
"		</tr>\n" +
"		<tr><td>创建人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>修改人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>审核人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>确认人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td>审批人</td>\n" +
"			<td><input type=\"text\" name=\"ad1\"></td>\n" +
"			<td><input type=\"radio\" name=\"ad1\" value=\"审核已打印\">审核已打印</td></tr>\n" +
"	</table>\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n" +
"	<div class=\"modal-dialog\">\n" +
"		<div class=\"modal-content\">\n" +
"			<div class=\"modal-header\">\n" +
"				<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">\n" +
"					&times;\n" +
"				</button>\n" +
"				<h4 class=\"modal-title\" id=\"myModalLabel\">\n" +
"					可选列\n" +
"				</h4>\n" +
"			</div>\n" +
"			<div class=\"modal-body\">\n" +
"				<div >\n" +
"	<form class=\"bs-example bs-example-form\" role=\"form\">\n" +
"		<table class=\"v6\"> \n" +
"\n" +
"			<tr>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"p\">\n" +
"					  </span>\n" +
"					  配件\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"d\">\n" +
"					  </span>\n" +
"					  订单号\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"y\">\n" +
"					  </span>\n" +
"					  剩余\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"\n" +
"\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"y0\">\n" +
"					  </span>\n" +
"					  预补\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"z\">\n" +
"					  </span>\n" +
"					  制造\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"x\">\n" +
"					  </span>\n" +
"					  序号\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"\n" +
"\n" +
"			</tr>\n" +
"			<tr>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"z0\">\n" +
"					  </span>\n" +
"					  总价\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"z00\">\n" +
"					  </span>\n" +
"					  找零\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"\n" +
"				</td>\n" +
"				<td>\n" +
"					<div class=\"input-group\">\n" +
"					  <span class=\"input-group-addon\">\n" +
"						<input type=\"checkbox\" value=\"j\">\n" +
"					  </span>\n" +
"					  金额\n" +
"\n" +
"					\n" +
"				    </div>\n" +
"				</td>\n" +
"\n" +
"\n" +
"			</tr>\n" +
"\n" +
"		</table>\n" +
"	</form>\n" +
"</div>\n" +
"			</div>\n" +
"			<div class=\"modal-footer\">\n" +
"				<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭\n" +
"				</button>\n" +
"				<button type=\"button\" id=\"bt\" class=\"btn btn-primary\">\n" +
"					提交更改\n" +
"				</button>\n" +
"			</div>\n" +
"		</div><!-- /.modal-content -->\n" +
"	</div><!-- /.modal -->\n" +
"</div>\n" +
"\n" +
"	\n" +
"\n" +
"\n" +
"	\n" +
"\n" +
"\n" +
"	<script src=\"http://cdn.bootcss.com/bootstrap-table/1.9.1/bootstrap-table.min.js\"></script>\n" +
"	\n" +
"	<script src=\"http://cdn.bootcss.com/bootstrap-table/1.9.1/locale/bootstrap-table-zh-CN.min.js\"></script>\n" +
"	\n" +
"</body>\n" +
"</html>";
    a.replaceAll("(\\r\\n|\\r|\\n|\\n\\r)","") ; 
    
    EmployeeOperation.getInstance().saveEmployee(a) ; 
    List<String> ar=new ArrayList<>() ; 
    
    ar = EmployeeOperation.getInstance().selectEmployee() ; 
    System.out.print(ar); 
    String path = "D:\\360安全浏览器下载\\sublimetext\\Sublime_Text3_Stable_Build_3143_x64_Chs\\Sublime Text\\file.html";
        File file = new File(path);
        if(!file.exists()){
    //先得到文件的上级目录，并创建上级目录，在创建文件
    file.getParentFile().mkdir();
    try {
        //创建文件
        file.createNewFile();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader(file) ; 
        BufferedReader br = new BufferedReader(fr);
        System.out.print(br) ;  
        if(br.readLine()==null){
        bw.write(ar.get(6));}
        System.out.print(ar.get(6));
        bw.flush();
        bw.close();
        fw.close();
        
         java.awt.Desktop.getDesktop().open(file);
   
}
}