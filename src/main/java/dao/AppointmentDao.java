package dao;

import org.apache.ibatis.annotations.Param;

import entity.Appointment;

public interface AppointmentDao {
//����ΪʲôҪ�������Ĳ������@Paramע���أ�
/*	����Ϊ�÷��������������ϵĲ�����һ��Ҫ�ӣ���Ȼmybatisʶ���ˡ�
	�����BookDao�ӿڵ�queryById������reduceNumber����ֻ��һ������book_id��
	���Կ��Բ��ü� @Paramע�⣬��Ȼ����Ҳ����ν~
	//����ԤԼͼ���¼
*/	/**
	 * 
	 * @param bookId
	 * @param studentId
	 * @return ���������
	 */
	int insertAppointMent(@Param("bookId")long  bookId,@Param("studentId") long studentId);
	/**
	 * ͨ��������ѯԤԼͼ���¼������Я��ͼ��ʵ��
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId,@Param("studentId")long studentId);
}
