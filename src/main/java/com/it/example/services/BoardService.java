package com.it.example.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.it.example.beans.vo.BoardVO;

@Service
public interface BoardService {
	public void register(BoardVO board);
	public BoardVO get(Long bno);
	public boolean modify(BoardVO board);
	public boolean remove(Long bno);
	public List<BoardVO> getList();
}