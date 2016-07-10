package com.bygone.www.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.bygone.www.model.User;

@Controller
public class CommonController
{
//	//不带任何参数的请求
//	@RequestMapping("index")
//	public String Index()
//	{
//		return "index";
//	}
//	
//	//带参数的请求
//	//返回字符串类型
//	@RequestMapping("hello")
//	public String LoginCheak(@RequestParam String name,@RequestParam(required=false) String psw) 
//	{
//		System.out.println(name+"-"+psw);
//		return "hello";
//	}
//	
//	//返回一个对象
//	@RequestMapping("getuser")
//	public String getUser(Map<String, Object>map)
//	{
//		User user=new User();
//		user.setId(123);
//		user.setUsername("大连理工");
//		user.setPassword("2014");
//		map.put("user", user);
//		return "showUser";
//	}
//	
//	//使用redirect跳转
//	@RequestMapping("/redirect")
//	public String redirect()
//	{
//		return "redirect:index";
//	}
//	
//	@RequestMapping(value = "/upload")  
//    public String upload(@RequestParam(value = "file", required = false) MultipartFile file, 
//    		HttpServletRequest request, ModelMap model) 
//	{
//        System.out.println("开始:");  
//        System.out.println("文件长度: " + file.getSize());   
//        System.out.println("文件类型: " + file.getContentType());   
//        System.out.println("文件名称: " + file.getName());   
//        System.out.println("文件原名: " + file.getOriginalFilename());
//        String path = request.getSession().getServletContext().getRealPath("upload");  
//        String fileName = file.getOriginalFilename();  
////        String fileName = new Date().getTime()+".jpg";  
//        System.out.println("文件在服务器中的保存位置："+path);  
//        File targetFile = new File(path, fileName);  
//        if(!targetFile.exists()){  
//            targetFile.mkdirs();  
//        }
//        //保存  
//        try {  
//            file.transferTo(targetFile);  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//        model.addAttribute("fileUrl", request.getContextPath()+"/upload/"+fileName);  
//  
//        return "index";  
//    } 
//	
//	
//	// 单图片上传
//	@RequestMapping(value = "/singleupload", method = RequestMethod.POST)
//	private String fildUpload(User users, @RequestParam(value = "file", required = false) MultipartFile file,
//			HttpServletRequest request) throws Exception {
//		// 基本表单
//		System.out.println(users.toString() + "文件名：" + file.getOriginalFilename());
//		// 获得物理路径webapp所在路径
//		String pathRoot = request.getSession().getServletContext().getRealPath("");
//		String path = "";
//		if (!file.isEmpty()) {
//			// 生成uuid作为文件名称
//			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//			// 获得文件类型（可以判断如果不是图片，禁止上传）
//			String contentType = file.getContentType();
//			System.out.println("文件类型：" + contentType);
//			// 获得文件后缀名称
//			String imageName = contentType.substring(contentType.indexOf("/") + 1);
//			// path="/static/images/"+uuid+"."+imageName;
//			path = "\\images\\" + uuid + "." + imageName;
//
//			File dir = new File(pathRoot + "\\images\\");
//			if (!dir.exists()) {
//				if (dir.mkdirs()) {
//					System.out.println("目录创建成功");
//				} else {
//					System.out.println("目录创建失败");
//					return "error";
//				}
//			}
//			System.out.println("保存的路径：" + pathRoot);
//			File saveFile = new File(pathRoot + path);
//			file.transferTo(saveFile);
//			request.setAttribute("imagesPath", pathRoot + path);
//		}
//		return "singleupload";
//	}
//
//	// 因为我的JSP在WEB-INF目录下面，浏览器无法直接访问
//	@RequestMapping(value = "/forward")
//	private String forward() {
//		return "singleupload";
//	}
//	
//	
//	
//	//多个图片文件上传
//	@RequestMapping(value="/multiupload",method=RequestMethod.POST)  
//    private String fildUpload(User users ,@RequestParam(value="file",required=false) MultipartFile[] file,  
//            HttpServletRequest request)throws Exception
//    {  
//        //基本表单  
//        System.out.println(users.toString());
//        //获得物理路径webapp所在路径  
//        String pathRoot = request.getSession().getServletContext().getRealPath("");
//        File dir = new File(pathRoot + "\\images\\");
//		if (!dir.exists()) {
//			if (dir.mkdirs()) {
//				System.out.println("目录创建成功");
//			} else {
//				System.out.println("目录创建失败");
//				return "error";
//			}
//		}
//        String path="";  
//        List<String> listImagePath=new ArrayList<String>();  
//        for (MultipartFile mf : file) 
//        {  
//            if(!mf.isEmpty())
//            {  
//                //生成uuid作为文件名称  
//                String uuid = UUID.randomUUID().toString().replaceAll("-","");  
//                //获得文件类型（可以判断如果不是图片，禁止上传）  
//                String contentType=mf.getContentType();  
//                //获得文件后缀名称  
//                String imageName=contentType.substring(contentType.indexOf("/")+1);  
////                path="/static/images/"+uuid+"."+imageName;  
//                path = "\\images\\" + uuid + "." + imageName;
//                mf.transferTo(new File(pathRoot+path));  
////                listImagePath.add(path);  
//                listImagePath.add(pathRoot+path);
//                System.out.println("多文件上传保存的 文件路径："+pathRoot+path);
//            }  
//        }
//        System.out.println(path);  
//        request.setAttribute("imagesPathList", listImagePath);  
//        return "multipupload";  
//    }
//	
//	
//	/**返回json数据
//	 * 需要导入相应的json jar文件
//	 * @return
//	 */
//	@ResponseBody
//	@RequestMapping("getjson")
//	public User getJsonUser()
//	{
//		User user=new User();
//		user.setId(12);
//		user.setPassword("327125");
//		user.setUsername("阿里");
//		return user;
//	}
	
}
