package com.lingnan.usersys.usermgrsys.business.dao;
import java.util.Vector;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgrsys.domian.ReaderVO;
/**
 * ����dao�ӿ�
 * @author Administrator
 *
 */
public interface ReaderDao extends BaseDao{
	/**
	 *��Ӷ���
	 * @param reader ������Ϣ
	 * @return ����ֵΪtrue����false
	 */
	public boolean addReader(ReaderVO reader);
	/**
	 * ������Ϣ����
	 * @param reader ������Ϣ
	 * @return ����true����false
	 */
	public boolean updateReader(ReaderVO reader);
	/**
	 * ����id���Ҷ���
	 * @param rid ���߱��
	 * @return  ���ض��߶���
	 */
	public ReaderVO findReaderByid(String rid);
	
	/**
	 * �������ж���
	 * @return  ���ض��߶���	 
	 */
	public Vector<ReaderVO> findAllReader();
	/**
	 * ����rid��ɾ������
	 * @param rid ���߱��
	 * @return  true����false
	 */
	public boolean deleteReaderByid(String rid);
}
